package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_424 {
    private final Production63_424 production = new Production63_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}