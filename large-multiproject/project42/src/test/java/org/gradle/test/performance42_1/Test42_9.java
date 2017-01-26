package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_9 {
    private final Production42_9 production = new Production42_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}