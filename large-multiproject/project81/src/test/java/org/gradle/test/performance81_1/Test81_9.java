package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_9 {
    private final Production81_9 production = new Production81_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}