package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_20 {
    private final Production64_20 production = new Production64_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}