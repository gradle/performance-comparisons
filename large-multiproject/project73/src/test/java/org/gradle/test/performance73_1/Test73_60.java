package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_60 {
    private final Production73_60 production = new Production73_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}