package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_381 {
    private final Production45_381 production = new Production45_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}