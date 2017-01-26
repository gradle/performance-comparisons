package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_458 {
    private final Production5_458 production = new Production5_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}