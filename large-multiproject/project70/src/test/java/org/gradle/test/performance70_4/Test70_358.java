package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_358 {
    private final Production70_358 production = new Production70_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}