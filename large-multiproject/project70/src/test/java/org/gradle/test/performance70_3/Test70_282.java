package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_282 {
    private final Production70_282 production = new Production70_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}