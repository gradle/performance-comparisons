package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_38 {
    private final Production20_38 production = new Production20_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}