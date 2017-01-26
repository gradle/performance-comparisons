package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_84 {
    private final Production64_84 production = new Production64_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}