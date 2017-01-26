package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_322 {
    private final Production45_322 production = new Production45_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}