package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_111 {
    private final Production73_111 production = new Production73_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}