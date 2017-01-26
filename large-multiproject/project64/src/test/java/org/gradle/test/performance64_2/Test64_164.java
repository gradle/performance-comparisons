package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_164 {
    private final Production64_164 production = new Production64_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}