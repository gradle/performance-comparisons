package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_49 {
    private final Production46_49 production = new Production46_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}