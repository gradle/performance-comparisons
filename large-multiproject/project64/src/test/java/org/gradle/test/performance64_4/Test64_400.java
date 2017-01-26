package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_400 {
    private final Production64_400 production = new Production64_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}