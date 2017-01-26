package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_160 {
    private final Production91_160 production = new Production91_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}