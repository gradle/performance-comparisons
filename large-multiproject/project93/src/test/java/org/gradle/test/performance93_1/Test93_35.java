package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_35 {
    private final Production93_35 production = new Production93_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}