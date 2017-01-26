package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_166 {
    private final Production46_166 production = new Production46_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}