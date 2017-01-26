package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_310 {
    private final Production5_310 production = new Production5_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}