package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_68 {
    private final Production46_68 production = new Production46_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}