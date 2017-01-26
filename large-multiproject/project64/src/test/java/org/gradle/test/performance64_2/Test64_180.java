package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_180 {
    private final Production64_180 production = new Production64_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}