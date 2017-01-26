package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_62 {
    private final Production70_62 production = new Production70_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}