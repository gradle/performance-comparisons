package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_241 {
    private final Production37_241 production = new Production37_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}