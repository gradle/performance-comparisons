package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_250 {
    private final Production59_250 production = new Production59_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}