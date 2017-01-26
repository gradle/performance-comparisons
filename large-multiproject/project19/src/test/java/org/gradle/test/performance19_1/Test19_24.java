package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_24 {
    private final Production19_24 production = new Production19_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}