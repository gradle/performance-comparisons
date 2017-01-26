package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_25 {
    private final Production49_25 production = new Production49_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}