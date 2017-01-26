package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_432 {
    private final Production7_432 production = new Production7_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}