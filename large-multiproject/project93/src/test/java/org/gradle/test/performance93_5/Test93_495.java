package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_495 {
    private final Production93_495 production = new Production93_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}