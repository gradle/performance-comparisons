package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_267 {
    private final Production22_267 production = new Production22_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}