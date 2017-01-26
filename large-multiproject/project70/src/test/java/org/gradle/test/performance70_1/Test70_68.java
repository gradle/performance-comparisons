package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_68 {
    private final Production70_68 production = new Production70_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}