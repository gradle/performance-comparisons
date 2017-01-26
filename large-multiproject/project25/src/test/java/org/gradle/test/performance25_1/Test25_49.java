package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_49 {
    private final Production25_49 production = new Production25_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}