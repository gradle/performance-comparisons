package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_119 {
    private final Production7_119 production = new Production7_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}