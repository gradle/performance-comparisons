package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_259 {
    private final Production37_259 production = new Production37_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}