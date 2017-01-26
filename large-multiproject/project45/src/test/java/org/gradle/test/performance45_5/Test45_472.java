package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_472 {
    private final Production45_472 production = new Production45_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}