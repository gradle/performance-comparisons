package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_10 {
    private final Production7_10 production = new Production7_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}