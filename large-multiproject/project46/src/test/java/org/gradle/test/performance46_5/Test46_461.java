package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_461 {
    private final Production46_461 production = new Production46_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}