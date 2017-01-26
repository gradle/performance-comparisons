package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_413 {
    private final Production64_413 production = new Production64_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}