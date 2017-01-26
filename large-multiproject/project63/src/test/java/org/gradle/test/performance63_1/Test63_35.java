package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_35 {
    private final Production63_35 production = new Production63_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}