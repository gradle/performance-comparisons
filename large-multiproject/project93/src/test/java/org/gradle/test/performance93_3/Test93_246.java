package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_246 {
    private final Production93_246 production = new Production93_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}