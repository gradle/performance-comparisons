package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_77 {
    private final Production46_77 production = new Production46_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}