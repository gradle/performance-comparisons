package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_112 {
    private final Production93_112 production = new Production93_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}