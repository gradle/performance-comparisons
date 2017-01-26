package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_167 {
    private final Production10_167 production = new Production10_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}