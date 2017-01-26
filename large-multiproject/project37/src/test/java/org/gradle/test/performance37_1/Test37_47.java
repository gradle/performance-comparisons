package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_47 {
    private final Production37_47 production = new Production37_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}