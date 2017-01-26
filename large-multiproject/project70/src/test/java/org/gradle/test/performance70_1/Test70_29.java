package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_29 {
    private final Production70_29 production = new Production70_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}