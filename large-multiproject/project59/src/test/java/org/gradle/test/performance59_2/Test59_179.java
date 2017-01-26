package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_179 {
    private final Production59_179 production = new Production59_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}