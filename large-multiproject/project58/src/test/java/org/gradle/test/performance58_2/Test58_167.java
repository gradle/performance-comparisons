package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_167 {
    private final Production58_167 production = new Production58_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}