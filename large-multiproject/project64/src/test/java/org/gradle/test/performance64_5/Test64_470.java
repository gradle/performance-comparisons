package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_470 {
    private final Production64_470 production = new Production64_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}