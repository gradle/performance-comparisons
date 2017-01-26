package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_49 {
    private final Production58_49 production = new Production58_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}