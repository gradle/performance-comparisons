package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_126 {
    private final Production7_126 production = new Production7_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}