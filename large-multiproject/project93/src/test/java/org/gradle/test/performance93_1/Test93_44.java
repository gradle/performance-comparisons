package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_44 {
    private final Production93_44 production = new Production93_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}