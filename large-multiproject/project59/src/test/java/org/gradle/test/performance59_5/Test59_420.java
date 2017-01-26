package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_420 {
    private final Production59_420 production = new Production59_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}