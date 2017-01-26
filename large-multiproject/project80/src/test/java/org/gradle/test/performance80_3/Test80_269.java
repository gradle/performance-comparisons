package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_269 {
    private final Production80_269 production = new Production80_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}