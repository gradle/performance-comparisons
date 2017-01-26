package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_269 {
    private final Production48_269 production = new Production48_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}