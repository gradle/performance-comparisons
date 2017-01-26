package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_445 {
    private final Production70_445 production = new Production70_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}