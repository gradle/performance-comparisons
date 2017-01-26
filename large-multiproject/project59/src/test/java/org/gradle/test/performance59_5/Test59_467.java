package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_467 {
    private final Production59_467 production = new Production59_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}