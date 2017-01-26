package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_208 {
    private final Production30_208 production = new Production30_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}