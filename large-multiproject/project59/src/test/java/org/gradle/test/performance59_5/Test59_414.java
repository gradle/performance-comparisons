package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_414 {
    private final Production59_414 production = new Production59_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}