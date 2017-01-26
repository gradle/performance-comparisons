package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_334 {
    private final Production64_334 production = new Production64_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}