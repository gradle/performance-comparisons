package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_405 {
    private final Production64_405 production = new Production64_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}