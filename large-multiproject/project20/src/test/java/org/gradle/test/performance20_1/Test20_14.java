package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_14 {
    private final Production20_14 production = new Production20_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}