package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_10 {
    private final Production70_10 production = new Production70_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}