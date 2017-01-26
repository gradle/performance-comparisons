package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_111 {
    private final Production64_111 production = new Production64_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}