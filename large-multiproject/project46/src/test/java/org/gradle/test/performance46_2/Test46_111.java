package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_111 {
    private final Production46_111 production = new Production46_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}