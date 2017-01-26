package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_168 {
    private final Production7_168 production = new Production7_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}