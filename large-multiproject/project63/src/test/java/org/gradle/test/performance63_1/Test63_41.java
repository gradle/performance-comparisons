package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_41 {
    private final Production63_41 production = new Production63_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}