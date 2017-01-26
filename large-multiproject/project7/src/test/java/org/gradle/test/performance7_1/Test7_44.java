package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_44 {
    private final Production7_44 production = new Production7_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}