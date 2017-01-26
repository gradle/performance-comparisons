package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_345 {
    private final Production64_345 production = new Production64_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}