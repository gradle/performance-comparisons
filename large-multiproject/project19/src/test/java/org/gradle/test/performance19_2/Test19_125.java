package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_125 {
    private final Production19_125 production = new Production19_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}