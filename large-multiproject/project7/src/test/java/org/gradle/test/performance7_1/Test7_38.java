package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_38 {
    private final Production7_38 production = new Production7_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}