package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_154 {
    private final Production63_154 production = new Production63_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}