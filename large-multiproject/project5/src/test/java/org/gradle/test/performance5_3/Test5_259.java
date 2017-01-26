package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_259 {
    private final Production5_259 production = new Production5_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}