package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_92 {
    private final Production5_92 production = new Production5_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}