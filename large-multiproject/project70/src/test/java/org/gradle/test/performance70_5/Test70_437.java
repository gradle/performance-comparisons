package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_437 {
    private final Production70_437 production = new Production70_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}