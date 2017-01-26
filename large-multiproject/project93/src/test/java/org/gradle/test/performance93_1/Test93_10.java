package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_10 {
    private final Production93_10 production = new Production93_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}