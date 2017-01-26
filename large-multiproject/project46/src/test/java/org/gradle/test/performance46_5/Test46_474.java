package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_474 {
    private final Production46_474 production = new Production46_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}