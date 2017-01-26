package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_6 {
    private final Production37_6 production = new Production37_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}