package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_306 {
    private final Production63_306 production = new Production63_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}