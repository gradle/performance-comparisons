package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_269 {
    private final Production27_269 production = new Production27_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}