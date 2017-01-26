package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_284 {
    private final Production64_284 production = new Production64_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}