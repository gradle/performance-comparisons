package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_482 {
    private final Production45_482 production = new Production45_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}