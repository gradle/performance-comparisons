package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_14 {
    private final Production93_14 production = new Production93_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}