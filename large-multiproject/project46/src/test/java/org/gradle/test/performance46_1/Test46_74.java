package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_74 {
    private final Production46_74 production = new Production46_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}