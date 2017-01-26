package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_1 {
    private final Production37_1 production = new Production37_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}