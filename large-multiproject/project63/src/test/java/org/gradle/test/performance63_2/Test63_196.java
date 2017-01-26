package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_196 {
    private final Production63_196 production = new Production63_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}