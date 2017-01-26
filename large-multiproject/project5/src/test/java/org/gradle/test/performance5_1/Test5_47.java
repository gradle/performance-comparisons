package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_47 {
    private final Production5_47 production = new Production5_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}