package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_465 {
    private final Production70_465 production = new Production70_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}