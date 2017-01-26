package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_95 {
    private final Production64_95 production = new Production64_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}