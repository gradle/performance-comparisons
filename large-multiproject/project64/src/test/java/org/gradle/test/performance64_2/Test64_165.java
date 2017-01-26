package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_165 {
    private final Production64_165 production = new Production64_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}