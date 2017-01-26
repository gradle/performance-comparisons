package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_259 {
    private final Production10_259 production = new Production10_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}