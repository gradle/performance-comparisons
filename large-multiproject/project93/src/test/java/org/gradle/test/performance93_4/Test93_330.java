package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_330 {
    private final Production93_330 production = new Production93_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}