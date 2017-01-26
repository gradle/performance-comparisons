package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_352 {
    private final Production91_352 production = new Production91_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}