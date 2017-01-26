package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_435 {
    private final Production63_435 production = new Production63_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}