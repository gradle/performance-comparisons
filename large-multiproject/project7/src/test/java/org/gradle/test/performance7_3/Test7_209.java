package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_209 {
    private final Production7_209 production = new Production7_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}