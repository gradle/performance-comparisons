package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_6 {
    private final Production45_6 production = new Production45_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}