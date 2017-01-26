package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_222 {
    private final Production63_222 production = new Production63_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}