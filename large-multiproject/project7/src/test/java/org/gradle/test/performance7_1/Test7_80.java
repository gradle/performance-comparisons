package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_80 {
    private final Production7_80 production = new Production7_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}