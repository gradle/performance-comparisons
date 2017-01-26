package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_276 {
    private final Production19_276 production = new Production19_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}