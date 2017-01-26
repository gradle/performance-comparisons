package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_119 {
    private final Production63_119 production = new Production63_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}