package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_139 {
    private final Production93_139 production = new Production93_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}