package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_238 {
    private final Production22_238 production = new Production22_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}