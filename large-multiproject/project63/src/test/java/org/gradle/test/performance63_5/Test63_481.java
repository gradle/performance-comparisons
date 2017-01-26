package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_481 {
    private final Production63_481 production = new Production63_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}