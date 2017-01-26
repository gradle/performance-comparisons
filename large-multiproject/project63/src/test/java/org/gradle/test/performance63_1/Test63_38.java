package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_38 {
    private final Production63_38 production = new Production63_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}