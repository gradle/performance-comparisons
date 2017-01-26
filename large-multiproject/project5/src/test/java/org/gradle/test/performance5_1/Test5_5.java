package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_5 {
    private final Production5_5 production = new Production5_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}