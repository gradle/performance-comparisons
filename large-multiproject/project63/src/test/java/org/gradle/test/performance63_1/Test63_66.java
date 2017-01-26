package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_66 {
    private final Production63_66 production = new Production63_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}