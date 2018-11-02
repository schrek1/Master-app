package cz.vse.overovac.service

import android.support.test.runner.AndroidJUnit4
import androidx.test.core.app.ApplicationProvider
import cz.vse.overovac.MainApplication
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowToast


@RunWith(AndroidJUnit4::class)
class DummyServiceTest {

    private var dummyService: DummyService = DummyService(ApplicationProvider.getApplicationContext())


    @Before
    fun setupBeforeTests() {
        dummyService = DummyService(ApplicationProvider.getApplicationContext())
    }

    @Test
    fun showToastTest() {
        dummyService.showToast()
        assertEquals("Hello i try show toast", ShadowToast.getTextOfLatestToast());
    }
}