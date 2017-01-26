package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_201 {
    private final Production45_201 production = new Production45_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}