package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_167 {
    private final Production70_167 production = new Production70_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}