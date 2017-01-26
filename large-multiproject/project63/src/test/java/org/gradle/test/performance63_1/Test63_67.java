package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_67 {
    private final Production63_67 production = new Production63_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}