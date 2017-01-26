package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_136 {
    private final Production64_136 production = new Production64_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}