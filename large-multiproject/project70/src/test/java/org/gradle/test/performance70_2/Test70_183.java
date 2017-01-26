package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_183 {
    private final Production70_183 production = new Production70_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}