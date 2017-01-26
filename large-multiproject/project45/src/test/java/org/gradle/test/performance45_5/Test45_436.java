package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_436 {
    private final Production45_436 production = new Production45_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}