package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_81 {
    private final Production64_81 production = new Production64_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}