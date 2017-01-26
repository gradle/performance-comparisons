package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_78 {
    private final Production20_78 production = new Production20_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}