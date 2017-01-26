package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_442 {
    private final Production93_442 production = new Production93_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}