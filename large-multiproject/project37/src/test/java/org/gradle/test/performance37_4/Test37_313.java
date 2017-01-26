package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_313 {
    private final Production37_313 production = new Production37_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}