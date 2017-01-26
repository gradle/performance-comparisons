package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_35 {
    private final Production5_35 production = new Production5_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}