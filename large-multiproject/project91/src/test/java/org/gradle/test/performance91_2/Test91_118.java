package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_118 {
    private final Production91_118 production = new Production91_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}