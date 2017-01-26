package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_32 {
    private final Production64_32 production = new Production64_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}