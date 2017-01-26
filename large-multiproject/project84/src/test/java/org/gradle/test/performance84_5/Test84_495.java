package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_495 {
    private final Production84_495 production = new Production84_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}