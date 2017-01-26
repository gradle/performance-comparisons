package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_406 {
    private final Production70_406 production = new Production70_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}