package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_320 {
    private final Production70_320 production = new Production70_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}