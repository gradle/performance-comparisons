package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_231 {
    private final Production93_231 production = new Production93_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}