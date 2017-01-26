package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_210 {
    private final Production45_210 production = new Production45_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}