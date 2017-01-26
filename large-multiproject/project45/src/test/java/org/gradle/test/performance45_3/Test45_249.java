package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_249 {
    private final Production45_249 production = new Production45_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}