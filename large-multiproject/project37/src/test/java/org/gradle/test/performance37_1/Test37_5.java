package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_5 {
    private final Production37_5 production = new Production37_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}