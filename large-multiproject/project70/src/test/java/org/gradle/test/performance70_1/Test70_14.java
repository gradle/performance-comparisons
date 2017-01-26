package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_14 {
    private final Production70_14 production = new Production70_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}