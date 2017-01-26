package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_500 {
    private final Production7_500 production = new Production7_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}