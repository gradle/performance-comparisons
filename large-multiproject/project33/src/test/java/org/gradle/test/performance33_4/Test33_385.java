package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_385 {
    private final Production33_385 production = new Production33_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}