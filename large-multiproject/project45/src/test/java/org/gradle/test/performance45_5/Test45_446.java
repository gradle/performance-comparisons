package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_446 {
    private final Production45_446 production = new Production45_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}