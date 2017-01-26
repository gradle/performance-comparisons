package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_14 {
    private final Production22_14 production = new Production22_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}