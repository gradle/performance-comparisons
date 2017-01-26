package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_40 {
    private final Production20_40 production = new Production20_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}