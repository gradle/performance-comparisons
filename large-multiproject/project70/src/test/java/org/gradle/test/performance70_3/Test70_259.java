package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_259 {
    private final Production70_259 production = new Production70_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}