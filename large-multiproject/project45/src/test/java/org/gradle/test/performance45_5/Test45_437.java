package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_437 {
    private final Production45_437 production = new Production45_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}