package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_98 {
    private final Production70_98 production = new Production70_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}