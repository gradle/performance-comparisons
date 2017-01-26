package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_294 {
    private final Production70_294 production = new Production70_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}