package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_256 {
    private final Production19_256 production = new Production19_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}