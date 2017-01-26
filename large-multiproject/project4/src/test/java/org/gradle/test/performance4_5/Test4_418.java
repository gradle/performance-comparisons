package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_418 {
    private final Production4_418 production = new Production4_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}