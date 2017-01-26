package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_269 {
    private final Production13_269 production = new Production13_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}