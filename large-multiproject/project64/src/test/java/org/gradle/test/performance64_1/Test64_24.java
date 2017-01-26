package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_24 {
    private final Production64_24 production = new Production64_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}