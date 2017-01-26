package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_12 {
    private final Production5_12 production = new Production5_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}