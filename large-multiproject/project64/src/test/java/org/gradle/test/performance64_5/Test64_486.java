package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_486 {
    private final Production64_486 production = new Production64_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}