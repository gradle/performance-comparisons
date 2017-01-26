package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_71 {
    private final Production20_71 production = new Production20_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}