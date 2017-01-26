package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_305 {
    private final Production93_305 production = new Production93_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}