package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_49 {
    private final Production42_49 production = new Production42_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}