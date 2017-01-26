package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_354 {
    private final Production64_354 production = new Production64_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}