package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_372 {
    private final Production59_372 production = new Production59_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}