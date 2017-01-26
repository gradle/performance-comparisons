package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_89 {
    private final Production70_89 production = new Production70_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}