package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_269 {
    private final Production47_269 production = new Production47_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}