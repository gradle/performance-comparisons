package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_253 {
    private final Production70_253 production = new Production70_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}