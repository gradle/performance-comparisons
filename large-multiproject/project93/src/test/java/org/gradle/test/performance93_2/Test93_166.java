package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_166 {
    private final Production93_166 production = new Production93_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}