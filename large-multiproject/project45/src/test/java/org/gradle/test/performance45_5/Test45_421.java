package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_421 {
    private final Production45_421 production = new Production45_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}