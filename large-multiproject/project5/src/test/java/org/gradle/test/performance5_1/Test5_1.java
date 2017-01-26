package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_1 {
    private final Production5_1 production = new Production5_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}