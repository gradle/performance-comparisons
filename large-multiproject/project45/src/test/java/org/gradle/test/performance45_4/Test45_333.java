package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_333 {
    private final Production45_333 production = new Production45_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}