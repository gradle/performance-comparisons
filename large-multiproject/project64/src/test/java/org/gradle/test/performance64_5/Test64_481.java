package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_481 {
    private final Production64_481 production = new Production64_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}