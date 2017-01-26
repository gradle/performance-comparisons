package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_330 {
    private final Production70_330 production = new Production70_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}