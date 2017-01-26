package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_306 {
    private final Production49_306 production = new Production49_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}