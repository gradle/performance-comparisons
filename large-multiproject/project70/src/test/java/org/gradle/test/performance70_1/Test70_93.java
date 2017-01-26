package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_93 {
    private final Production70_93 production = new Production70_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}