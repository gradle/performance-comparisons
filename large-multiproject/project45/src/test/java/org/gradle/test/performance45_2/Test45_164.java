package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_164 {
    private final Production45_164 production = new Production45_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}