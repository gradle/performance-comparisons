package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_8 {
    private final Production93_8 production = new Production93_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}