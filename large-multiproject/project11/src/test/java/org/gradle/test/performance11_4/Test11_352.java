package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_352 {
    private final Production11_352 production = new Production11_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}