package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_309 {
    private final Production93_309 production = new Production93_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}