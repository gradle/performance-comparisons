package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_253 {
    private final Production93_253 production = new Production93_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}