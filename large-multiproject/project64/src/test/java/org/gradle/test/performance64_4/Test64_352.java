package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_352 {
    private final Production64_352 production = new Production64_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}