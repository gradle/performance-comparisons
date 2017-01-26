package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_195 {
    private final Production70_195 production = new Production70_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}