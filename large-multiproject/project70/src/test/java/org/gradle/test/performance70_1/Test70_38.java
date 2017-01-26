package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_38 {
    private final Production70_38 production = new Production70_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}