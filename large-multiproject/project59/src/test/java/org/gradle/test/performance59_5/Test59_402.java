package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_402 {
    private final Production59_402 production = new Production59_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}