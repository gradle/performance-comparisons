package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_111 {
    private final Production23_111 production = new Production23_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}