package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_49 {
    private final Production86_49 production = new Production86_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}