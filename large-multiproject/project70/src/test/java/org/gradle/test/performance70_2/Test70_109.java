package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_109 {
    private final Production70_109 production = new Production70_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}