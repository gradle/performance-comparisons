package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_18 {
    private final Production64_18 production = new Production64_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}