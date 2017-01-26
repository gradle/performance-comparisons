package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_270 {
    private final Production63_270 production = new Production63_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}