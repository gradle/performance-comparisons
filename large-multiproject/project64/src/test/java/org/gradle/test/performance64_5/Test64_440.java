package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_440 {
    private final Production64_440 production = new Production64_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}