package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_310 {
    private final Production37_310 production = new Production37_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}