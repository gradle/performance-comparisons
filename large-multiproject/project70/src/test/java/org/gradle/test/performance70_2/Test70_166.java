package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_166 {
    private final Production70_166 production = new Production70_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}