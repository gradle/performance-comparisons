package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_225 {
    private final Production70_225 production = new Production70_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}