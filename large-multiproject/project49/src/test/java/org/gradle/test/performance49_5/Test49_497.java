package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_497 {
    private final Production49_497 production = new Production49_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}