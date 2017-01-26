package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_209 {
    private final Production8_209 production = new Production8_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}