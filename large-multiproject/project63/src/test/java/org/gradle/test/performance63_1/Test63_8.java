package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_8 {
    private final Production63_8 production = new Production63_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}