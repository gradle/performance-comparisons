package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_106 {
    private final Production22_106 production = new Production22_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}