package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_41 {
    private final Production20_41 production = new Production20_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}