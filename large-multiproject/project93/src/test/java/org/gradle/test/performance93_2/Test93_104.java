package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_104 {
    private final Production93_104 production = new Production93_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}