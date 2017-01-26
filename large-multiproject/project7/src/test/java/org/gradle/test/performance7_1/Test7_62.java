package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_62 {
    private final Production7_62 production = new Production7_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}