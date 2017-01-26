package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_432 {
    private final Production70_432 production = new Production70_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}