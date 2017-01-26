package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_61 {
    private final Production42_61 production = new Production42_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}