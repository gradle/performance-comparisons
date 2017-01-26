package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_109 {
    private final Production22_109 production = new Production22_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}