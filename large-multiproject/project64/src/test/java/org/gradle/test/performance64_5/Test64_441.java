package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_441 {
    private final Production64_441 production = new Production64_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}