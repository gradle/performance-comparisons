package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_96 {
    private final Production70_96 production = new Production70_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}