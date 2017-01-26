package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_25 {
    private final Production63_25 production = new Production63_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}