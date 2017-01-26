package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_167 {
    private final Production8_167 production = new Production8_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}