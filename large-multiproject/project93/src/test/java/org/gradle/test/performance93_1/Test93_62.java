package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_62 {
    private final Production93_62 production = new Production93_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}