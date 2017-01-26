package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_130 {
    private final Production91_130 production = new Production91_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}