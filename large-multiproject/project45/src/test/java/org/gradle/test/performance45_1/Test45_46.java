package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_46 {
    private final Production45_46 production = new Production45_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}