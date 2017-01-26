package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_321 {
    private final Production64_321 production = new Production64_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}