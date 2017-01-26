package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_18 {
    private final Production45_18 production = new Production45_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}