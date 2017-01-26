package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_212 {
    private final Production70_212 production = new Production70_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}