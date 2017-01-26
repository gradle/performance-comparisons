package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_124 {
    private final Production91_124 production = new Production91_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}