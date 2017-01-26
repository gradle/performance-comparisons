package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_469 {
    private final Production64_469 production = new Production64_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}