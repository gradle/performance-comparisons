package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_25 {
    private final Production93_25 production = new Production93_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}