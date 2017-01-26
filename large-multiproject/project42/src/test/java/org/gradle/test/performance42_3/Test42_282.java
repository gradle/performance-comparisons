package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_282 {
    private final Production42_282 production = new Production42_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}