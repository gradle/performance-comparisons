package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_377 {
    private final Production45_377 production = new Production45_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}