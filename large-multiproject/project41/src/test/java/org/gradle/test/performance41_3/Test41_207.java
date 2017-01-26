package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_207 {
    private final Production41_207 production = new Production41_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}