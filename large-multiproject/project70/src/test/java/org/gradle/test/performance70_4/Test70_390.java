package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_390 {
    private final Production70_390 production = new Production70_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}