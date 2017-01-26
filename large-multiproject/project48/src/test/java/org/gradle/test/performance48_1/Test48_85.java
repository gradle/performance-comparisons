package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_85 {
    private final Production48_85 production = new Production48_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}