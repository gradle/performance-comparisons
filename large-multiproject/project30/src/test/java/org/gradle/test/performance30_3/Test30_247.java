package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_247 {
    private final Production30_247 production = new Production30_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}