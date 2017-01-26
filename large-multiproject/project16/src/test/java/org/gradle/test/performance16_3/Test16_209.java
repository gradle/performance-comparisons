package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_209 {
    private final Production16_209 production = new Production16_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}