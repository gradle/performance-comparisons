package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_391 {
    private final Production91_391 production = new Production91_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}