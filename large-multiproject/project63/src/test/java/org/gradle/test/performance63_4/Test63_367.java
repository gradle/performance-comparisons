package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_367 {
    private final Production63_367 production = new Production63_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}