package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_419 {
    private final Production64_419 production = new Production64_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}