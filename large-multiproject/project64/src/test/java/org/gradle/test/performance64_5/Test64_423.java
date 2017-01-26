package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_423 {
    private final Production64_423 production = new Production64_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}