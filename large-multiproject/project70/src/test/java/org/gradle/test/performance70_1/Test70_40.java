package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_40 {
    private final Production70_40 production = new Production70_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}