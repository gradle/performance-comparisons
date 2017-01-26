package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_43 {
    private final Production46_43 production = new Production46_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}