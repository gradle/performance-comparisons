package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_209 {
    private final Production5_209 production = new Production5_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}