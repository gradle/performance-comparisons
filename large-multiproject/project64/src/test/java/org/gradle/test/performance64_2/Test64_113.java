package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_113 {
    private final Production64_113 production = new Production64_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}