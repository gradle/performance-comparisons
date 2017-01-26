package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_278 {
    private final Production59_278 production = new Production59_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}