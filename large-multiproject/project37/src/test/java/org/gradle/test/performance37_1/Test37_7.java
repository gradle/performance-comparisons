package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_7 {
    private final Production37_7 production = new Production37_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}