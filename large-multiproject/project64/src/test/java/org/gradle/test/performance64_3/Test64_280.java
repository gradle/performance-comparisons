package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_280 {
    private final Production64_280 production = new Production64_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}