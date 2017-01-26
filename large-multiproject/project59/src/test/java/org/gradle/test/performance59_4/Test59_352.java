package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_352 {
    private final Production59_352 production = new Production59_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}