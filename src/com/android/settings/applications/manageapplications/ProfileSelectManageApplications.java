/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.applications.manageapplications;

import static com.android.settings.applications.manageapplications.ManageApplications.EXTRA_PERSONAL_ONLY;
import static com.android.settings.applications.manageapplications.ManageApplications.EXTRA_WORK_ONLY;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.android.settings.dashboard.profileselector.ProfileSelectFragment;

/**
 * Application Setting page for work profile.
 */
public class ProfileSelectManageApplications extends ProfileSelectFragment {

    @Override
    public Fragment[] getFragments() {
        final Bundle workOnly = new Bundle();
        workOnly.putBoolean(EXTRA_WORK_ONLY, true);
        final Fragment workFragment = new ManageApplications();
        workFragment.setArguments(workOnly);

        final Bundle personalOnly = new Bundle();
        personalOnly.putBoolean(EXTRA_PERSONAL_ONLY, true);
        final Fragment personalFragment = new ManageApplications();
        personalFragment.setArguments(personalOnly);
        return new Fragment[] {
                personalFragment, //0
                workFragment
        };
    }
}
