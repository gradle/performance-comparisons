package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_228 {
    private final Production7_228 production = new Production7_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}