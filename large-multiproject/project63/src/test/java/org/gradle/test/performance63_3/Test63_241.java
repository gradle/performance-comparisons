package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_241 {
    private final Production63_241 production = new Production63_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}