package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_1 {
    private final Production45_1 production = new Production45_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}