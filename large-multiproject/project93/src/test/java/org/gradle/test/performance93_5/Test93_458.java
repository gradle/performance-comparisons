package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_458 {
    private final Production93_458 production = new Production93_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}