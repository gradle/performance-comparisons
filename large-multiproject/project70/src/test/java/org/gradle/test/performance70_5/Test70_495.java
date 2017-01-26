package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_495 {
    private final Production70_495 production = new Production70_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}