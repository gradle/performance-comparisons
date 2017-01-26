package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_467 {
    private final Production45_467 production = new Production45_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}