package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_121 {
    private final Production59_121 production = new Production59_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}