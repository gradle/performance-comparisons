package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_32 {
    private final Production19_32 production = new Production19_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}