package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_142 {
    private final Production64_142 production = new Production64_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}