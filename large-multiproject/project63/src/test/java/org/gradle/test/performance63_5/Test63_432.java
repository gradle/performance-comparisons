package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_432 {
    private final Production63_432 production = new Production63_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}