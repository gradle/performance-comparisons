package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_269 {
    private final Production25_269 production = new Production25_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}