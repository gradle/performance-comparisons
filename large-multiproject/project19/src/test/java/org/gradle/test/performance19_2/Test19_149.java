package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_149 {
    private final Production19_149 production = new Production19_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}