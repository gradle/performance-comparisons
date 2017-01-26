package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_442 {
    private final Production63_442 production = new Production63_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}