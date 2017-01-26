package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_3 {
    private final Production7_3 production = new Production7_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}