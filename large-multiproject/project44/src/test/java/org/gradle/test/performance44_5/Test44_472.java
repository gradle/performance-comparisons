package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_472 {
    private final Production44_472 production = new Production44_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}