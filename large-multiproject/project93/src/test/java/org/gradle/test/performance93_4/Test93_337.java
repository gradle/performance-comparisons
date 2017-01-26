package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_337 {
    private final Production93_337 production = new Production93_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}