package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_167 {
    private final Production50_167 production = new Production50_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}