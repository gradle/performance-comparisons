package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_167 {
    private final Production3_167 production = new Production3_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}