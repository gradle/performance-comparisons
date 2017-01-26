package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_419 {
    private final Production45_419 production = new Production45_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}