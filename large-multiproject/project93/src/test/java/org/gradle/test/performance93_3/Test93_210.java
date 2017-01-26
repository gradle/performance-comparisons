package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_210 {
    private final Production93_210 production = new Production93_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}