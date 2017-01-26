package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_420 {
    private final Production45_420 production = new Production45_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}