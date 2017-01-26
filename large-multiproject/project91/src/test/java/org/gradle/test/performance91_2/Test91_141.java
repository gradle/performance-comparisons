package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_141 {
    private final Production91_141 production = new Production91_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}