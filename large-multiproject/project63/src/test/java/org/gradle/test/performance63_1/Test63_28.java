package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_28 {
    private final Production63_28 production = new Production63_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}