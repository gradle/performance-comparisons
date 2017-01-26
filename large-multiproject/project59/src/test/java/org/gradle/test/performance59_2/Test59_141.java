package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_141 {
    private final Production59_141 production = new Production59_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}