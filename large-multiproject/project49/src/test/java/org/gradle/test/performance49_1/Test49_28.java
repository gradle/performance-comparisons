package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_28 {
    private final Production49_28 production = new Production49_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}