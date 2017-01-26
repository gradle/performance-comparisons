package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_269 {
    private final Production40_269 production = new Production40_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}