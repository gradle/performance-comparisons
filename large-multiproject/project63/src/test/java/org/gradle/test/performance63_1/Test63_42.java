package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_42 {
    private final Production63_42 production = new Production63_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}