package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_61 {
    private final Production37_61 production = new Production37_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}