package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_126 {
    private final Production70_126 production = new Production70_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}