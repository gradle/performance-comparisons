package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_302 {
    private final Production63_302 production = new Production63_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}