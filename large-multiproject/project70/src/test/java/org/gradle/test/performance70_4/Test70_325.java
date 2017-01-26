package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_325 {
    private final Production70_325 production = new Production70_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}