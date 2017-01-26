package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_396 {
    private final Production93_396 production = new Production93_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}