package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_379 {
    private final Production64_379 production = new Production64_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}