package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_169 {
    private final Production64_169 production = new Production64_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}