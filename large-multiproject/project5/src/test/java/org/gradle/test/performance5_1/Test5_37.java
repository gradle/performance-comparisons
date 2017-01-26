package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_37 {
    private final Production5_37 production = new Production5_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}