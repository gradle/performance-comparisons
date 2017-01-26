package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_60 {
    private final Production93_60 production = new Production93_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}