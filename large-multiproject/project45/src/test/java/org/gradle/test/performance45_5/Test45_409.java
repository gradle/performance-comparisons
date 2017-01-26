package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_409 {
    private final Production45_409 production = new Production45_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}