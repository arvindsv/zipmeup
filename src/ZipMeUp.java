/* ************************GO-LICENSE-START*********************************
 * Copyright 2015 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ************************GO-LICENSE-END***********************************/

import java.io.File;
import java.util.zip.Deflater;

public class ZipMeUp {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new RuntimeException("Usage: java -cp zipmeup.jar ZipMeUp directory-to-zip");
        }

        File source = new File(args[0]);
        File tmpDir = File.createTempFile("go-zip-test", "out");
        tmpDir.delete(); /* I said quick and dirty. */
        tmpDir.mkdirs();
        System.err.println("Output zip file will be in: " + tmpDir);

        File dataToUpload = new File(tmpDir, source.getName() + ".zip");
        dataToUpload.createNewFile();
        new ZipUtil().zip(source, dataToUpload, Deflater.BEST_SPEED);
    }
}
