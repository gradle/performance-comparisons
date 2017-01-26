package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_417 {
    private final Production70_417 production = new Production70_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}