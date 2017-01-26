package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_36 {
    private final Production93_36 production = new Production93_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}