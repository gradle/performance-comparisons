package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_179 {
    private final Production19_179 production = new Production19_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}