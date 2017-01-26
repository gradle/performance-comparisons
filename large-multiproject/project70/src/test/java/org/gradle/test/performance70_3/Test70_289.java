package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_289 {
    private final Production70_289 production = new Production70_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}