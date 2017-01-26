package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_13 {
    private final Production59_13 production = new Production59_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}