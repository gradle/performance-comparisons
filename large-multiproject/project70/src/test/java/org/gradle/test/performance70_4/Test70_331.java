package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_331 {
    private final Production70_331 production = new Production70_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}