package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_160 {
    private final Production19_160 production = new Production19_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}