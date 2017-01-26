package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_489 {
    private final Production59_489 production = new Production59_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}