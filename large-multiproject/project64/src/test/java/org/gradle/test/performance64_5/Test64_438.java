package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_438 {
    private final Production64_438 production = new Production64_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}