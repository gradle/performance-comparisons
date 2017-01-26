package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_110 {
    private final Production91_110 production = new Production91_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}