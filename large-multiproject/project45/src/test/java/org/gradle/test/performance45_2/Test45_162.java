package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_162 {
    private final Production45_162 production = new Production45_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}