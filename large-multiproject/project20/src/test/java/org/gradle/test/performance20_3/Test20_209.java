package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_209 {
    private final Production20_209 production = new Production20_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}