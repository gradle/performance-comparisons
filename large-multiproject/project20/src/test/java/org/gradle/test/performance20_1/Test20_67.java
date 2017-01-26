package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_67 {
    private final Production20_67 production = new Production20_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}