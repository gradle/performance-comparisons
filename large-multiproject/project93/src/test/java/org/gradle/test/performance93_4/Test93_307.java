package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_307 {
    private final Production93_307 production = new Production93_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}