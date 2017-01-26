package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_97 {
    private final Production70_97 production = new Production70_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}