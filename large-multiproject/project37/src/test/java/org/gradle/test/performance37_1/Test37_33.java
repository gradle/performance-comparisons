package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_33 {
    private final Production37_33 production = new Production37_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}