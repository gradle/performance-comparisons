package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_156 {
    private final Production45_156 production = new Production45_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}