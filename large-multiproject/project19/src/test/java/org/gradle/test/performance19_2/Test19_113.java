package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_113 {
    private final Production19_113 production = new Production19_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}