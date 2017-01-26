package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_339 {
    private final Production64_339 production = new Production64_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}