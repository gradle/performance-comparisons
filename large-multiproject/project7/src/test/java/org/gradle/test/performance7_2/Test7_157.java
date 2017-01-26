package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_157 {
    private final Production7_157 production = new Production7_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}