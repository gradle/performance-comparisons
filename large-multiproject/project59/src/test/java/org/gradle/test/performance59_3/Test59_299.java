package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_299 {
    private final Production59_299 production = new Production59_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}