package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_382 {
    private final Production70_382 production = new Production70_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}