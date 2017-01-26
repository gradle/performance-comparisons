package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_398 {
    private final Production73_398 production = new Production73_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}