package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_308 {
    private final Production59_308 production = new Production59_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}