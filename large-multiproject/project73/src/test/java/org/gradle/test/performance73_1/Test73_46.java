package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_46 {
    private final Production73_46 production = new Production73_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}