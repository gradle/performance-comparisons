package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_431 {
    private final Production63_431 production = new Production63_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}