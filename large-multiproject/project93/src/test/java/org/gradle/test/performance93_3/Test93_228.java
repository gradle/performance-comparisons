package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_228 {
    private final Production93_228 production = new Production93_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}