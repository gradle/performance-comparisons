package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_167 {
    private final Production30_167 production = new Production30_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}