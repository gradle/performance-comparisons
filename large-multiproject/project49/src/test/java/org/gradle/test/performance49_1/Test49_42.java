package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_42 {
    private final Production49_42 production = new Production49_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}