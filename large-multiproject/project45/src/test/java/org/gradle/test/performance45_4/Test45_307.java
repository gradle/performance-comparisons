package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_307 {
    private final Production45_307 production = new Production45_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}