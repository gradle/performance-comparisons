package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_89 {
    private final Production93_89 production = new Production93_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}