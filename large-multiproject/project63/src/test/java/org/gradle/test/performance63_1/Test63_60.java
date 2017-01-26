package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_60 {
    private final Production63_60 production = new Production63_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}