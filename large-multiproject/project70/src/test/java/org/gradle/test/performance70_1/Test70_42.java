package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_42 {
    private final Production70_42 production = new Production70_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}