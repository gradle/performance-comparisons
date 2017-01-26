package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_479 {
    private final Production73_479 production = new Production73_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}