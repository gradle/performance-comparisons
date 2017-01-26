package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_398 {
    private final Production63_398 production = new Production63_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}