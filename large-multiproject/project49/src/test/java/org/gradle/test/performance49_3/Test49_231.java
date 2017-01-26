package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_231 {
    private final Production49_231 production = new Production49_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}