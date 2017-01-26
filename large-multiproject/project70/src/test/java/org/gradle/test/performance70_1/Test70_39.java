package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_39 {
    private final Production70_39 production = new Production70_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}