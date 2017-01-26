package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_261 {
    private final Production73_261 production = new Production73_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}