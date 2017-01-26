package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_41 {
    private final Production7_41 production = new Production7_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}