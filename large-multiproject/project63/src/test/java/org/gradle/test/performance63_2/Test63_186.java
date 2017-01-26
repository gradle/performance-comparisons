package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_186 {
    private final Production63_186 production = new Production63_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}