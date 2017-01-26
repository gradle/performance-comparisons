package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_499 {
    private final Production45_499 production = new Production45_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}