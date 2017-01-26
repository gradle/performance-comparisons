package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_398 {
    private final Production64_398 production = new Production64_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}