package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_80 {
    private final Production70_80 production = new Production70_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}