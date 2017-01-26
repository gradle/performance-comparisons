package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_214 {
    private final Production93_214 production = new Production93_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}