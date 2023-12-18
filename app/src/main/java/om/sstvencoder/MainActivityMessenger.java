/*
Copyright 2017 Olga Miller <olga.rgb@gmail.com>

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package om.sstvencoder;

import android.os.Handler;

import om.sstvencoder.Output.WaveFileOutputContext;

class MainActivityMessenger {
    private final MainActivity mMainActivity;
    private final Handler mHandler;

    MainActivityMessenger(MainActivity activity) {
        mMainActivity = activity;
        mHandler = new Handler();
    }

    void carrySaveAsWaveIsDoneMessage(final WaveFileOutputContext context) {
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                mMainActivity.completeSaving(context);
            }
        });
    }

    public String getString(int resId, Object... formatArgs) {
        return mMainActivity.getString(resId, formatArgs);
    }
}
