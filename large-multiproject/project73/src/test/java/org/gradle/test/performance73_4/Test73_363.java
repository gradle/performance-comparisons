package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_363 {
    private final Production73_363 production = new Production73_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}