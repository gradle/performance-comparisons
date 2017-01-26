package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_126 {
    private final Production20_126 production = new Production20_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}