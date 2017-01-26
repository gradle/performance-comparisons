package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_39 {
    private final Production20_39 production = new Production20_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}