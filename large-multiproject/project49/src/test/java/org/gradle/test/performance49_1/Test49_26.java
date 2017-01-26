package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_26 {
    private final Production49_26 production = new Production49_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}