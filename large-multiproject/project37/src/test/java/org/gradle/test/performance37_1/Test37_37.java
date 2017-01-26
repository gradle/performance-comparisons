package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_37 {
    private final Production37_37 production = new Production37_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}