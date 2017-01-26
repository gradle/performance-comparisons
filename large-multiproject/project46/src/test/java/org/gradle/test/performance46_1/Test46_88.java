package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_88 {
    private final Production46_88 production = new Production46_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}