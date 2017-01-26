package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_394 {
    private final Production59_394 production = new Production59_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}