package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_67 {
    private final Production70_67 production = new Production70_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}