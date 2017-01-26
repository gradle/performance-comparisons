package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_313 {
    private final Production5_313 production = new Production5_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}