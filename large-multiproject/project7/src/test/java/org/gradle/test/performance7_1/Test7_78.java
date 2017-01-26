package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_78 {
    private final Production7_78 production = new Production7_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}