package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_292 {
    private final Production91_292 production = new Production91_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}