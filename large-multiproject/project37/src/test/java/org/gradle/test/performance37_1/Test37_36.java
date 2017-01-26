package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_36 {
    private final Production37_36 production = new Production37_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}