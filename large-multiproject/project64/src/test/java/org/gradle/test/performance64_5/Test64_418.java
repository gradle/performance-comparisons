package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_418 {
    private final Production64_418 production = new Production64_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}