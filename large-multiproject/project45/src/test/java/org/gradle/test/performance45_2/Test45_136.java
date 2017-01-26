package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_136 {
    private final Production45_136 production = new Production45_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}