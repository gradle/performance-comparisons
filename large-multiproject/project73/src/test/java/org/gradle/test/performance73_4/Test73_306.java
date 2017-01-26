package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_306 {
    private final Production73_306 production = new Production73_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}