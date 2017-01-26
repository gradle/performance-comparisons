package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_341 {
    private final Production19_341 production = new Production19_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}