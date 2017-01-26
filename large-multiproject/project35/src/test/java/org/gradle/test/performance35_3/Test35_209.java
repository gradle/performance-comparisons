package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_209 {
    private final Production35_209 production = new Production35_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}