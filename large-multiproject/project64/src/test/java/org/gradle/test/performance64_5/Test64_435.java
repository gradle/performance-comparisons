package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_435 {
    private final Production64_435 production = new Production64_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}