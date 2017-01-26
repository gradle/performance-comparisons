package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_199 {
    private final Production70_199 production = new Production70_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}