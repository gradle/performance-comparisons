package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_317 {
    private final Production45_317 production = new Production45_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}