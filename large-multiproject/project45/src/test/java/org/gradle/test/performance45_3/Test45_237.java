package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_237 {
    private final Production45_237 production = new Production45_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}