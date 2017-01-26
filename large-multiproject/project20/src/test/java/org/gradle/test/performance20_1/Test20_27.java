package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_27 {
    private final Production20_27 production = new Production20_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}