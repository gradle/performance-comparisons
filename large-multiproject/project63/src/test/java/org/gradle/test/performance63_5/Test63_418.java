package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_418 {
    private final Production63_418 production = new Production63_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}