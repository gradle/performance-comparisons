package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_244 {
    private final Production37_244 production = new Production37_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}