package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_20 {
    private final Production59_20 production = new Production59_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}