package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_290 {
    private final Production73_290 production = new Production73_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}