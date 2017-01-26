package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_73 {
    private final Production70_73 production = new Production70_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}