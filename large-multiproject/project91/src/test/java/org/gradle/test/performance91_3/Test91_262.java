package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_262 {
    private final Production91_262 production = new Production91_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}