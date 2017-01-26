package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_42 {
    private final Production37_42 production = new Production37_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}