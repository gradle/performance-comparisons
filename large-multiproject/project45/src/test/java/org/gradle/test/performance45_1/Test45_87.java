package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_87 {
    private final Production45_87 production = new Production45_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}