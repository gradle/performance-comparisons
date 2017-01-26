package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_343 {
    private final Production64_343 production = new Production64_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}