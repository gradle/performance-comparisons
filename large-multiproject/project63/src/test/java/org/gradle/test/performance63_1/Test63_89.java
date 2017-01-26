package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_89 {
    private final Production63_89 production = new Production63_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}