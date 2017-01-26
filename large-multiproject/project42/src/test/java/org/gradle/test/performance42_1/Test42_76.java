package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_76 {
    private final Production42_76 production = new Production42_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}