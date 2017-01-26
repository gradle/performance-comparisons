package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_296 {
    private final Production70_296 production = new Production70_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}