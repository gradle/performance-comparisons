package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_188 {
    private final Production63_188 production = new Production63_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}