package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_31 {
    private final Production93_31 production = new Production93_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}