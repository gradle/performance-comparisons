package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_204 {
    private final Production45_204 production = new Production45_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}