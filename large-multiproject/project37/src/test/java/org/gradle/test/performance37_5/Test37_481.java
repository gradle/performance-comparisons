package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_481 {
    private final Production37_481 production = new Production37_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}