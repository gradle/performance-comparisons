package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_15 {
    private final Production73_15 production = new Production73_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}