package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_111 {
    private final Production68_111 production = new Production68_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}