package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_405 {
    private final Production4_405 production = new Production4_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}