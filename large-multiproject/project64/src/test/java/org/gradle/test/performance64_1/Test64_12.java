package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_12 {
    private final Production64_12 production = new Production64_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}