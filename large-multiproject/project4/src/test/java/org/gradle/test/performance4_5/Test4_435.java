package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_435 {
    private final Production4_435 production = new Production4_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}