package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_67 {
    private final Production42_67 production = new Production42_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}