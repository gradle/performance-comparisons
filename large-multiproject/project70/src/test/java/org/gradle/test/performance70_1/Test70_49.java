package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_49 {
    private final Production70_49 production = new Production70_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}