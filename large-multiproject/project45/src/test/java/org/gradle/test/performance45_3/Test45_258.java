package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_258 {
    private final Production45_258 production = new Production45_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}