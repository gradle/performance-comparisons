package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_109 {
    private final Production73_109 production = new Production73_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}