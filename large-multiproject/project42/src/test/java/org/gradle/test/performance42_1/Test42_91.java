package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_91 {
    private final Production42_91 production = new Production42_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}