package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_231 {
    private final Production63_231 production = new Production63_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}