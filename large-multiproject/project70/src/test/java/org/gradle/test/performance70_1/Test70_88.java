package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_88 {
    private final Production70_88 production = new Production70_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}