package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_414 {
    private final Production91_414 production = new Production91_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}