package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_240 {
    private final Production59_240 production = new Production59_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}