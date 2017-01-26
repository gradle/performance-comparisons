package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_200 {
    private final Production7_200 production = new Production7_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}