package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_290 {
    private final Production63_290 production = new Production63_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}