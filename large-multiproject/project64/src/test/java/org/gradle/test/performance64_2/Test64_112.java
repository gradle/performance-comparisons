package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_112 {
    private final Production64_112 production = new Production64_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}