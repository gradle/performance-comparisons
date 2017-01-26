package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_286 {
    private final Production70_286 production = new Production70_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}