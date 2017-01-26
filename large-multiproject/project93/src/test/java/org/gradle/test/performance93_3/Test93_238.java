package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_238 {
    private final Production93_238 production = new Production93_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}