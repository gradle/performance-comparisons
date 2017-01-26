package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_200 {
    private final Production70_200 production = new Production70_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}