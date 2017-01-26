package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_304 {
    private final Production73_304 production = new Production73_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}