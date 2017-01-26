package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_228 {
    private final Production70_228 production = new Production70_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}