package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_238 {
    private final Production63_238 production = new Production63_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}