package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_41 {
    private final Production42_41 production = new Production42_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}