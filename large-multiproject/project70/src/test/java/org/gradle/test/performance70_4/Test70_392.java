package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_392 {
    private final Production70_392 production = new Production70_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}