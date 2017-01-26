package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_269 {
    private final Production86_269 production = new Production86_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}