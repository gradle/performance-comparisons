package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_189 {
    private final Production70_189 production = new Production70_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}