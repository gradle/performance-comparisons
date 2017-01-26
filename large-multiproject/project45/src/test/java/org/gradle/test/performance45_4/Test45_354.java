package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_354 {
    private final Production45_354 production = new Production45_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}