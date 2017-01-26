package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_272 {
    private final Production19_272 production = new Production19_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}