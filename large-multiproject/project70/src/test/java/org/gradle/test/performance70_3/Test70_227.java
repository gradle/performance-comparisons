package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_227 {
    private final Production70_227 production = new Production70_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}