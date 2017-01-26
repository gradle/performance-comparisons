package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_171 {
    private final Production64_171 production = new Production64_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}