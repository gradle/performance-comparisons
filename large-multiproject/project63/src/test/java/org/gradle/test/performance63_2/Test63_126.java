package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_126 {
    private final Production63_126 production = new Production63_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}