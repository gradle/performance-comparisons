package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_468 {
    private final Production63_468 production = new Production63_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}