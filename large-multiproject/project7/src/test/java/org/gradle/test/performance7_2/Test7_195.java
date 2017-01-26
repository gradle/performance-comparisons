package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_195 {
    private final Production7_195 production = new Production7_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}