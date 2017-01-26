package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_75 {
    private final Production70_75 production = new Production70_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}