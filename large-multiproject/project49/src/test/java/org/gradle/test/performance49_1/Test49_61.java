package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_61 {
    private final Production49_61 production = new Production49_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}