package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_287 {
    private final Production45_287 production = new Production45_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}