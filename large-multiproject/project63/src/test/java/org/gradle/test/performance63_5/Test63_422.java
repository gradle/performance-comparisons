package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_422 {
    private final Production63_422 production = new Production63_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}