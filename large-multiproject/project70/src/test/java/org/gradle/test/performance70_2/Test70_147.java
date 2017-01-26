package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_147 {
    private final Production70_147 production = new Production70_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}