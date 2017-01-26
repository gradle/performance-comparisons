package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_133 {
    private final Production91_133 production = new Production91_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}