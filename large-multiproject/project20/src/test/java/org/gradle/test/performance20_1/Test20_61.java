package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_61 {
    private final Production20_61 production = new Production20_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}