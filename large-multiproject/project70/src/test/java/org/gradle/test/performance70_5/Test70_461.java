package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_461 {
    private final Production70_461 production = new Production70_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}