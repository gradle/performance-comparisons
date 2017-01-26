package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_142 {
    private final Production19_142 production = new Production19_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}