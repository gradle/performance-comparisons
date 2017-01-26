package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_384 {
    private final Production79_384 production = new Production79_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}