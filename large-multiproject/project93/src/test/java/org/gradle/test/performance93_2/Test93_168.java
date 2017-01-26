package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_168 {
    private final Production93_168 production = new Production93_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}