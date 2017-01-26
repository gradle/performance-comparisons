package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_51 {
    private final Production22_51 production = new Production22_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}