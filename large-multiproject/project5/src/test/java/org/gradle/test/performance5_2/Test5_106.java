package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_106 {
    private final Production5_106 production = new Production5_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}