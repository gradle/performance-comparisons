package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_325 {
    private final Production22_325 production = new Production22_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}