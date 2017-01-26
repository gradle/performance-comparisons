package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_193 {
    private final Production45_193 production = new Production45_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}