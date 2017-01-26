package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_429 {
    private final Production59_429 production = new Production59_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}