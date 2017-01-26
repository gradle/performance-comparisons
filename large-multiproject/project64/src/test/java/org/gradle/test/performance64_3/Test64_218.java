package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_218 {
    private final Production64_218 production = new Production64_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}