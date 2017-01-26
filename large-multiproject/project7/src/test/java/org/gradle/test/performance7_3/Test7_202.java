package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_202 {
    private final Production7_202 production = new Production7_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}