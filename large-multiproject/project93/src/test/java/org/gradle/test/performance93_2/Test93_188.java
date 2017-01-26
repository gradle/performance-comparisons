package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_188 {
    private final Production93_188 production = new Production93_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}