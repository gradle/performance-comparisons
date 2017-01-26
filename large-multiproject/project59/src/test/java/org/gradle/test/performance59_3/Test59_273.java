package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_273 {
    private final Production59_273 production = new Production59_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}