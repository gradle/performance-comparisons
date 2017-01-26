package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_390 {
    private final Production93_390 production = new Production93_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}