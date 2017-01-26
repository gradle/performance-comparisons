package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_395 {
    private final Production64_395 production = new Production64_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}