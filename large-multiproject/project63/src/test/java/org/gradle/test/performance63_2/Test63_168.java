package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_168 {
    private final Production63_168 production = new Production63_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}