package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_304 {
    private final Production70_304 production = new Production70_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}