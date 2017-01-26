package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_192 {
    private final Production45_192 production = new Production45_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}