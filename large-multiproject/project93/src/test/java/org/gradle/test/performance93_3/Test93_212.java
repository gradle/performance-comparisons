package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_212 {
    private final Production93_212 production = new Production93_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}