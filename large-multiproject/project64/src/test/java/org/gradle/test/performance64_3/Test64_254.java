package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_254 {
    private final Production64_254 production = new Production64_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}