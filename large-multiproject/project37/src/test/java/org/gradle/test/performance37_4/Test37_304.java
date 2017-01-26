package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_304 {
    private final Production37_304 production = new Production37_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}