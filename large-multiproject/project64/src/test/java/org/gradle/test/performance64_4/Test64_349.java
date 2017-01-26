package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_349 {
    private final Production64_349 production = new Production64_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}