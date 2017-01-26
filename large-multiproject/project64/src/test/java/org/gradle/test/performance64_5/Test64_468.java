package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_468 {
    private final Production64_468 production = new Production64_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}