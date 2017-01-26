package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_75 {
    private final Production7_75 production = new Production7_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}