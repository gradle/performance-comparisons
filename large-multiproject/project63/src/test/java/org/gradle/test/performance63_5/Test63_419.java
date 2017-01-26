package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_419 {
    private final Production63_419 production = new Production63_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}