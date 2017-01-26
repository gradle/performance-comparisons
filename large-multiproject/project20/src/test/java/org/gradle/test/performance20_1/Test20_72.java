package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_72 {
    private final Production20_72 production = new Production20_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}