package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_287 {
    private final Production64_287 production = new Production64_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}