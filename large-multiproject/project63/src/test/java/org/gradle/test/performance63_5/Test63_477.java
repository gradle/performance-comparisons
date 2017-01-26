package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_477 {
    private final Production63_477 production = new Production63_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}