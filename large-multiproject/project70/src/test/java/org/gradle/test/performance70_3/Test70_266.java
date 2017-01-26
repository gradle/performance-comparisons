package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_266 {
    private final Production70_266 production = new Production70_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}