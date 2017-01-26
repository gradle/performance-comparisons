package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_49 {
    private final Production30_49 production = new Production30_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}