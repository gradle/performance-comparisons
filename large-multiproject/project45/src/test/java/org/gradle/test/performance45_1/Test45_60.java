package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_60 {
    private final Production45_60 production = new Production45_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}