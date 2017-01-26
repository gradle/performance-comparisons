package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_9 {
    private final Production70_9 production = new Production70_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}