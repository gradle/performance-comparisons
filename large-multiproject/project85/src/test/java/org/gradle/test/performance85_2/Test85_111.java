package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_111 {
    private final Production85_111 production = new Production85_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}