package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_310 {
    private final Production30_310 production = new Production30_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}