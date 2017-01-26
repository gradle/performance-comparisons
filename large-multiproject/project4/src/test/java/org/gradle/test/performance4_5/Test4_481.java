package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_481 {
    private final Production4_481 production = new Production4_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}