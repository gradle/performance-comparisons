package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_317 {
    private final Production73_317 production = new Production73_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}