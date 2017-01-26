package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_435 {
    private final Production89_435 production = new Production89_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}