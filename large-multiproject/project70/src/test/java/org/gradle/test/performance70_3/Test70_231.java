package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_231 {
    private final Production70_231 production = new Production70_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}