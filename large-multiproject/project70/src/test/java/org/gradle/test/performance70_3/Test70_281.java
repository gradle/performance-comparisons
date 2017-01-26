package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_281 {
    private final Production70_281 production = new Production70_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}