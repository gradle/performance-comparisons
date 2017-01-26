package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_444 {
    private final Production70_444 production = new Production70_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}