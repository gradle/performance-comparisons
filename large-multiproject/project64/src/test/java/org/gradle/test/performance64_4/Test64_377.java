package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_377 {
    private final Production64_377 production = new Production64_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}