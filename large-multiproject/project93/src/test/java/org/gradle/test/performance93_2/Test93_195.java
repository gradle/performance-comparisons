package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_195 {
    private final Production93_195 production = new Production93_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}