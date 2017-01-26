package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_49 {
    private final Production7_49 production = new Production7_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}