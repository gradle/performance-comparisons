package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_435 {
    private final Production45_435 production = new Production45_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}