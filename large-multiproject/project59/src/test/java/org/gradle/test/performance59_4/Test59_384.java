package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_384 {
    private final Production59_384 production = new Production59_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}