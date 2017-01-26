package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_95 {
    private final Production45_95 production = new Production45_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}