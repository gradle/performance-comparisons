package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_111 {
    private final Production91_111 production = new Production91_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}