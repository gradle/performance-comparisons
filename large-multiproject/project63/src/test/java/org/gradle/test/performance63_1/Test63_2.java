package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_2 {
    private final Production63_2 production = new Production63_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}