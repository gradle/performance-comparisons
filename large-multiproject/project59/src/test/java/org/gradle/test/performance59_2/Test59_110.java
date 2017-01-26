package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_110 {
    private final Production59_110 production = new Production59_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}