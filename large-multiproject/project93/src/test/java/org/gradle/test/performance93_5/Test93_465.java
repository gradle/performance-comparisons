package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_465 {
    private final Production93_465 production = new Production93_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}