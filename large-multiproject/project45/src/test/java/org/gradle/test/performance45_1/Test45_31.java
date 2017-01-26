package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_31 {
    private final Production45_31 production = new Production45_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}