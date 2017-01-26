package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_168 {
    private final Production70_168 production = new Production70_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}