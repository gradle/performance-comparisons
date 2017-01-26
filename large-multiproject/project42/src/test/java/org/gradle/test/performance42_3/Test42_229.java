package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_229 {
    private final Production42_229 production = new Production42_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}