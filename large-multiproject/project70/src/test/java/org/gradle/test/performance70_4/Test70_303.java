package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_303 {
    private final Production70_303 production = new Production70_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}