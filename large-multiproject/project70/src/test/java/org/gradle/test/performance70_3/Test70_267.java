package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_267 {
    private final Production70_267 production = new Production70_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}