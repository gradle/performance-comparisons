package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_106 {
    private final Production10_106 production = new Production10_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}