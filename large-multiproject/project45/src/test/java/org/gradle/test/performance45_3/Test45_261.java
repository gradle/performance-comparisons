package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_261 {
    private final Production45_261 production = new Production45_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}