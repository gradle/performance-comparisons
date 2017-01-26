package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_61 {
    private final Production63_61 production = new Production63_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}