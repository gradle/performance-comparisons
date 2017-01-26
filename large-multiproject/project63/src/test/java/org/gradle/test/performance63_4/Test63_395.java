package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_395 {
    private final Production63_395 production = new Production63_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}