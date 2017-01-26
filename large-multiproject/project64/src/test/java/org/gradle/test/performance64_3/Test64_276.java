package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_276 {
    private final Production64_276 production = new Production64_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}