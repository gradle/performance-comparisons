package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_464 {
    private final Production64_464 production = new Production64_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}