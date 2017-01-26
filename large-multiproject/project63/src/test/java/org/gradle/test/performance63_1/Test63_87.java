package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_87 {
    private final Production63_87 production = new Production63_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}