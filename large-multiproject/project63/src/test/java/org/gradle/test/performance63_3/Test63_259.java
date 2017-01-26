package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_259 {
    private final Production63_259 production = new Production63_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}