package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_27 {
    private final Production46_27 production = new Production46_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}