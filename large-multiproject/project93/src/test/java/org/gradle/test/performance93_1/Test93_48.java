package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_48 {
    private final Production93_48 production = new Production93_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}