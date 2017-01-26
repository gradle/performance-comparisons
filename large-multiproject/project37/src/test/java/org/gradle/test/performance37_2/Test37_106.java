package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_106 {
    private final Production37_106 production = new Production37_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}