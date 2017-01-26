package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_269 {
    private final Production75_269 production = new Production75_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}