package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_450 {
    private final Production93_450 production = new Production93_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}