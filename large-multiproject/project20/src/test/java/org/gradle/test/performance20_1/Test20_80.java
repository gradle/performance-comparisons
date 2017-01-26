package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_80 {
    private final Production20_80 production = new Production20_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}