package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_207 {
    private final Production22_207 production = new Production22_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}