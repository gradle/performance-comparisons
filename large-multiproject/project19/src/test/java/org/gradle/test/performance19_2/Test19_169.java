package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_169 {
    private final Production19_169 production = new Production19_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}