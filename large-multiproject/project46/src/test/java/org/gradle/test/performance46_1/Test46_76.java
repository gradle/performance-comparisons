package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_76 {
    private final Production46_76 production = new Production46_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}