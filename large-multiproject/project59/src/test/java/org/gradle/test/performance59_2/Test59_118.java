package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_118 {
    private final Production59_118 production = new Production59_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}