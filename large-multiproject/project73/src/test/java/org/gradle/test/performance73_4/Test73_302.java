package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_302 {
    private final Production73_302 production = new Production73_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}