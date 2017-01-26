package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_495 {
    private final Production4_495 production = new Production4_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}