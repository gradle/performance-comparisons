package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_388 {
    private final Production22_388 production = new Production22_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}