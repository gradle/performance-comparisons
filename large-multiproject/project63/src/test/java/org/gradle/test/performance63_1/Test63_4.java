package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_4 {
    private final Production63_4 production = new Production63_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}