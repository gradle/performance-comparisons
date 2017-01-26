package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_479 {
    private final Production45_479 production = new Production45_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}