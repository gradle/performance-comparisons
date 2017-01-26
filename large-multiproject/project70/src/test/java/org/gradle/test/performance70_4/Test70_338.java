package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_338 {
    private final Production70_338 production = new Production70_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}