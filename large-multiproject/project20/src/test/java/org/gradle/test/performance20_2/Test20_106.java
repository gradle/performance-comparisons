package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_106 {
    private final Production20_106 production = new Production20_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}