package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_131 {
    private final Production64_131 production = new Production64_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}