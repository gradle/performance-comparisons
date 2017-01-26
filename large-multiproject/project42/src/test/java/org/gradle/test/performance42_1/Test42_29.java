package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_29 {
    private final Production42_29 production = new Production42_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}