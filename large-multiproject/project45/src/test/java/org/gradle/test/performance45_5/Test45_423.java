package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_423 {
    private final Production45_423 production = new Production45_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}