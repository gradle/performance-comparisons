package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_362 {
    private final Production70_362 production = new Production70_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}