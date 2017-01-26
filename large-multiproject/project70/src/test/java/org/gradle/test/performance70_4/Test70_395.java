package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_395 {
    private final Production70_395 production = new Production70_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}