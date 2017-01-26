package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_304 {
    private final Production5_304 production = new Production5_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}