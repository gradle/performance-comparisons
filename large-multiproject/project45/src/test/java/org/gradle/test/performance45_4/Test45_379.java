package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_379 {
    private final Production45_379 production = new Production45_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}