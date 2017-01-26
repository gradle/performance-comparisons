package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_497 {
    private final Production93_497 production = new Production93_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}