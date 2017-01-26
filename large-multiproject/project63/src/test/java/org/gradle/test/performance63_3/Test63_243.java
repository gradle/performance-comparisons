package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_243 {
    private final Production63_243 production = new Production63_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}