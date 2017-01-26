package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_167 {
    private final Production7_167 production = new Production7_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}