package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_303 {
    private final Production93_303 production = new Production93_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}