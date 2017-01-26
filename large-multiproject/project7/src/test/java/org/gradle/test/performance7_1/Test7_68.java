package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_68 {
    private final Production7_68 production = new Production7_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}