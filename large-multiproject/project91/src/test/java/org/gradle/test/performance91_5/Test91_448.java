package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_448 {
    private final Production91_448 production = new Production91_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}