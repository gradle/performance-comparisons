package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_304 {
    private final Production45_304 production = new Production45_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}