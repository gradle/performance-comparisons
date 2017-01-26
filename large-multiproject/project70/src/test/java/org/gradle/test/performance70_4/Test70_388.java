package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_388 {
    private final Production70_388 production = new Production70_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}