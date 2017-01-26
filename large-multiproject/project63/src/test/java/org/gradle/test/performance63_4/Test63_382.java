package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_382 {
    private final Production63_382 production = new Production63_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}