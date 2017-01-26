package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_444 {
    private final Production93_444 production = new Production93_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}