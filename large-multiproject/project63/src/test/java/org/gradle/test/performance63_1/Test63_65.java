package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_65 {
    private final Production63_65 production = new Production63_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}