package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_358 {
    private final Production22_358 production = new Production22_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}