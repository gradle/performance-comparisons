package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_476 {
    private final Production63_476 production = new Production63_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}