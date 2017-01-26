package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_169 {
    private final Production59_169 production = new Production59_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}