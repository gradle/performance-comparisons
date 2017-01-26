package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_82 {
    private final Production70_82 production = new Production70_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}