package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_171 {
    private final Production45_171 production = new Production45_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}