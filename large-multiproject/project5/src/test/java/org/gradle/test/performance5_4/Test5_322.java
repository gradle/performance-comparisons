package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_322 {
    private final Production5_322 production = new Production5_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}