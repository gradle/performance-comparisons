package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_361 {
    private final Production93_361 production = new Production93_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}