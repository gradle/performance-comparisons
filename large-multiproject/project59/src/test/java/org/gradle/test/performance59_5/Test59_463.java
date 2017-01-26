package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_463 {
    private final Production59_463 production = new Production59_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}