package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_286 {
    private final Production93_286 production = new Production93_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}