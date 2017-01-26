package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_48 {
    private final Production45_48 production = new Production45_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}