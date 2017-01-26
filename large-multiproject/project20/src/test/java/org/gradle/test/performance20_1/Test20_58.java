package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_58 {
    private final Production20_58 production = new Production20_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}