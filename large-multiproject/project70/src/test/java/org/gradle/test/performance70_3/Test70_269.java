package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_269 {
    private final Production70_269 production = new Production70_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}