package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_95 {
    private final Production5_95 production = new Production5_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}