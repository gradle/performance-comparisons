package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_466 {
    private final Production4_466 production = new Production4_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}