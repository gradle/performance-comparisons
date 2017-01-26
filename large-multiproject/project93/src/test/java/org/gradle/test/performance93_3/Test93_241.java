package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_241 {
    private final Production93_241 production = new Production93_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}