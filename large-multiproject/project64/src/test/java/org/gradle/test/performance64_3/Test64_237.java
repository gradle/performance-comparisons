package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_237 {
    private final Production64_237 production = new Production64_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}