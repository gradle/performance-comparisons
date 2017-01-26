package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_458 {
    private final Production22_458 production = new Production22_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}