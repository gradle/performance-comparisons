package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_341 {
    private final Production64_341 production = new Production64_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}