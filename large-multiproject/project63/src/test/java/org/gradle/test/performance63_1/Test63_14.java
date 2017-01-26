package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_14 {
    private final Production63_14 production = new Production63_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}