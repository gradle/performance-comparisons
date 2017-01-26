package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_398 {
    private final Production45_398 production = new Production45_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}