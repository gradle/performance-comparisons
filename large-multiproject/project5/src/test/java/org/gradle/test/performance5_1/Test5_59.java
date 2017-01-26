package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_59 {
    private final Production5_59 production = new Production5_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}