package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_118 {
    private final Production19_118 production = new Production19_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}