package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_111 {
    private final Production19_111 production = new Production19_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}