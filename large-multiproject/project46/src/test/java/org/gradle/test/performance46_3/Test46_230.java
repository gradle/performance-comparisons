package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_230 {
    private final Production46_230 production = new Production46_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}