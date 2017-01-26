package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_97 {
    private final Production42_97 production = new Production42_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}