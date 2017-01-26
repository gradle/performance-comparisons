package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_96 {
    private final Production7_96 production = new Production7_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}