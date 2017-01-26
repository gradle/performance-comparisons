package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_334 {
    private final Production19_334 production = new Production19_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}