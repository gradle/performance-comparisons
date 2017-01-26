package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_185 {
    private final Production91_185 production = new Production91_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}