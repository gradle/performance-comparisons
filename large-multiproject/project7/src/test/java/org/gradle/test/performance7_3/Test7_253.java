package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_253 {
    private final Production7_253 production = new Production7_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}