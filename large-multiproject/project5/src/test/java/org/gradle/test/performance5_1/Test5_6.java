package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_6 {
    private final Production5_6 production = new Production5_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}