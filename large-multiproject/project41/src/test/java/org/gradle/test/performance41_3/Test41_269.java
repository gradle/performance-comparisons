package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_269 {
    private final Production41_269 production = new Production41_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}